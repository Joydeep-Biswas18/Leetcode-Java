# Rising Temperature

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Table: `Weather`

```
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| id            | int     |
| recordDate    | date    |
| temperature   | int     |
+---------------+---------+
id is the column with unique values for this table.
There are no different rows with the same recordDate.
This table contains information about the temperature on a certain day.

```

 

Write a solution to find all dates' `id` with higher temperatures compared to its previous dates (yesterday).

Return the result table in  **any order**.

The result format is in the following example.

 

 **Example 1:** 

```
Input: 
Weather table:
+----+------------+-------------+
| id | recordDate | temperature |
+----+------------+-------------+
| 1  | 2015-01-01 | 10          |
| 2  | 2015-01-02 | 25          |
| 3  | 2015-01-03 | 20          |
| 4  | 2015-01-04 | 30          |
+----+------------+-------------+
Output: 
+----+
| id |
+----+
| 2  |
| 4  |
+----+
Explanation: 
In 2015-01-02, the temperature was higher than the previous day (10 -> 25).
In 2015-01-04, the temperature was higher than the previous day (20 -> 30).

```

## Solution

**Language:** Python  
**Runtime:** 295 ms (beats 66.28%)  
**Memory:** 68.2 MB (beats 28.55%)  
**Submitted:** 2026-10-22T15:03:00.987Z  

```py
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
    
```

---

[View on LeetCode](https://leetcode.com/problems/rising-temperature/)