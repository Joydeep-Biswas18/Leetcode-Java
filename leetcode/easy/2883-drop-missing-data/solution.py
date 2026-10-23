import pandas as pd

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    # return students.dropna()
    # that is the good question for remembering the use case of dropna()
    # and one thing if you want to remove inly row then -> use -> dropna()
    # and for Column -> use -> ropna(axis=1) beacause axis = 1 refers to the column
    # taht code gives error because it reove all null value buti in the question ask to return that dataframe ehere only name column is null
    students.dropna(subset=['name'], how='any',inplace =True)
    return students