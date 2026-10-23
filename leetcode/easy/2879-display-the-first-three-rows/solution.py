import pandas as pd

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    return employees.head(3)
    # here just use the syntax pf pandas that directly gives the output
    # but here i can not use sample keyword because it returns random rows present in DataFrame
    