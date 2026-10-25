import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    filtered_data = animals[animals.weight>100]
    sorted_filterd_data = filtered_data.sort_values(by='weight', ascending=False)
    name = sorted_filterd_data[['name']]
    return name