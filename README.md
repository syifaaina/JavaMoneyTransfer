# JavaMoneyTransfer
Simple Money Transaction Application code using Java

By : Nur Syifa' Aina bt Zahaimi (1817794)

**1. Brief explanation about the system transition**

*Whether or not the application should accept the request to transfer money between different account depends on three factors:*
1. Whether the user is authorized to use the money transfer application.
2. Whether the OTP input by the user matches.
3. Whether the user has sufficient money to proceed with the transaction.

**2. State Transition table**

|Condition|L1|L2|L3|L4|
|---|---|---|---|---|
|1. Authorized user?|F|T|T|T|
|2. OTP match?|-|F|T|T|
|3. Sufficient money available?|-|-|F|T|
|**Action**|**A1**|**A2**|**A3**|**A4**| 
|1. Accept|-|-|-|/| 
|2. Reject|/|/|/|-|

**3. State transition diagram**

https://github.com/syifaaina/JavaMoneyTransfer/blob/301d4256b93423394e82a728505a9fc3ec0f2278/State%20Table.png

**4. Explanation about the code**

1. Authorize method
   - User have to enter the correct username and password.
   - If user enter wrong username or password, the system will loop the same method and keep asking user to enter correct username and password.
   - Correct username : cnc
   - Correct password : cnc123
   
2. CheckOTP method
   - User have to enter the correct OTP.
   - If user enter wrong OTP, the system will loop the same method asking user to enter the correct OTP.
   - Correct OTP : 1000
   
3. CheckBalance method
   - System ask user to input the amount to be transferred.
   - If the user enter the amount more than balance in account, the system will bring the user to the next method; ContinueTransaction().
   
4. ContinueTransaction method
   - The system ask the user whether they want to continue the transaction or end the transaction.
   - If the user choose to continue the transaction, the user will be return to CheckBalance method.

**5. Input Strings**

|Input Strings|Correct|Wrong|
|---|---|---|
|Username|cnc|abc|
|Password|cnc123|abc123|
|OTP|1000|123|
