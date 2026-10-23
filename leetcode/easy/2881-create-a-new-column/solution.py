import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees['bonus'] = employees['salary']* 2
    # that is the code of creating a new column in existing dataframe thats why i directly use the employees DataFrame not create another df
    return employees
    