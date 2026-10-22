import pandas as pd

def top_three_salaries(employee: pd.DataFrame, department: pd.DataFrame) -> pd.DataFrame:
    df = pd.merge(employee , department , left_on='departmentId' ,right_on ='id', how='left')
    df['rank'] = df.groupby('departmentId')['salary'].rank(method='dense',ascending =False)
    df= df[df['rank']<=3]


    return df[['name_x','name_y','salary']].rename(columns = {
        'name_x' :"Department",
        'name_y': 'Employee',
        'salary' : "Salary"
    })