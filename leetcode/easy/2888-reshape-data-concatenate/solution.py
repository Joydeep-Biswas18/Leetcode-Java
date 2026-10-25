import pandas as pd

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    df = pd.concat([df1 , df2] , axis = 0)
    # why is use  third bracket here because of pd.concat function requirs one argument so when i normally give df1 and df2 without using third bracket it behaves as two argument
    return df
    