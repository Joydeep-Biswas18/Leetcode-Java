CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
        select salary
        from (
            select distinct salary ,
            dense_rank() over(order by salary desc) as rnk
            from Employee
        )
        as getNthHighestSalary
        where rnk = N
  );
END