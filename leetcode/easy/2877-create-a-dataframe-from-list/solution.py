import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    column_name =['student_id','age']
    # here it should be remember that pd.DataFrame automatically fetch data from list of list so we dont need to use two nested for loop for fetching data inside any list of list
    result_df = pd.DataFrame(student_data , columns = column_name)
    return  result_df
    