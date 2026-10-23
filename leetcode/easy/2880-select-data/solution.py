import pandas as pd

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    df = pd.DataFrame(students[['name','age']]) # that code select these exact column from the table
    df = df.loc[students['student_id']==101] # that code filter out the exact requirment
    return df