# JavaMoneyTransfer
Simple Money Transaction Application code using Java

**1. Brief explanation about the system transition**

*Whether or not the application should accept the request to transfer money between different account depends on three factors:*
*1) Whether the user is authorized to use the money transfer application.*
*2) Whether the OTP input by the user matches.*
*3) Whether the user has sufficient money to proceed with the transaction.*

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
