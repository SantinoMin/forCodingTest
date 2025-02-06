
# *SUV차량의 평균 일일 대여요금 출력 SQL 작성 문제
# *평균 일일 대여 요금은 소수점 첫 번째 자리에서 반올림
# *컬럼명 AVERAGE_FEE로 지정

# !! 소수점 첫 번째 자리에서 반올림 하는 방법?

# SELECT ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE
# FROM CAR_RENTAL_COMPANY_CAR
# WHERE CAR_TYPE = "SUV";