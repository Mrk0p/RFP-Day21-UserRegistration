# RFP-Day21-UserRegistration

UC 1 :- As a User need to enter a valid First Name
- First name starts with Cap and has minimum 3 characters

UC 2 :- As a User need to enter a valid Last Name
- Last name starts with Cap and has minimum 3 characters

UC 3 :- As a User need to enter a valid email 
- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
precise @ and . positions

UC 4 :- As a User need to follow pre
-defined Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number

UC 5 :- As a User need tofollow pre
-defined Password rules.
Rule1– minimum 8 Characters 
- NOTE – All rules must be passed

UC 6 : - Rule2 – Should have at least 1 Upper Case 
- NOTE – All rules must be passed

UC 7 :- Rule3 – Should have at least 1 numeric number in the password 
- NOTE – All rules must be passed

UC 8 :-Rule4 – Has exactly 1 Special Character
- NOTE – All rules must be passed

UC 9 :-Should clear all email samples provided separately


UC 10 :- Write JUnit Test to validate the User Entry for First Name, Last Name, Email, Mobile, and Password.
- Write Junit Test for Happy as well as Sad test case.
- Happy Test Case validates the Entry Successfully
- Sad Test Cases fails the Entry

UC 11:- Write JUnit Parameterised Test to validate multiple entry for the Email Address.

UC 12 :- Refactor the Code to throw custom exceptions in case ofInvalid User Details
- Rewrite all Test Cases to take in Custom Exception for Invalid First Name, Last Name, Email, Mobile, and Password

