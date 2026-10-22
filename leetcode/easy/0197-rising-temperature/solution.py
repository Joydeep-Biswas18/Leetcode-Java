import pandas as pd

def rising_temperature(weather: pd.DataFrame) -> pd.DataFrame:
    weather['recordDate'] = pd.to_datetime(weather['recordDate'])

    w1 = weather.copy()
    w2 = weather.copy()

    w1['previousDate'] = w1['recordDate'] - pd.Timedelta(days=1)

    df = pd.merge(
        w1,
        w2,
        left_on='previousDate',
        right_on='recordDate',
        how='inner',
        suffixes=('_today', '_yesterday')
    )

    df = df[df['temperature_today'] > df['temperature_yesterday']]

    return df[['id_today']].rename(columns={'id_today': 'id'})
    