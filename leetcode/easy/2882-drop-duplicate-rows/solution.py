import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    customers.drop_duplicates(subset='email',keep ='first', inplace = True)
    # always remember when you use drop_duplicates then inside it please use subset = targeted column name in inverted comma
    return customers
    