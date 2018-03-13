# spring-security-jwt 


						FOR CREATE BASIC TOKEN   (Basic bXktdHJ1c3RlZC1jbGllbnQ6c2VjcmV0 )
							Authorization
	 						BASIC AUTH  

							Input   Username = my-trusted-client  (withClient)
									Password = secret (secret)
							Output  Basic bXktdHJ1c3RlZC1jbGllbnQ6c2VjcmV0


POST CaLL == http://localhost:8080/oauth/token

header 
	Authorization = Basic bXktdHJ1c3RlZC1jbGllbnQ6c2VjcmV0
	Content-Type  = application/x-www-form-urlencoded
body (x-www-form-urlencoded)
	username = bill
	password = abc123
	grant_type = password
	client_id = my-trusted-client (withClient)	


GET == http://localhost:8080/user/test
header 
	Authorization = bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1MjA5Mzk4OTQsInVzZXJfbmFtZSI6ImJpbGwiLCJhdXRob3JpdGllcyI6WyJST0xFX0FETUlOIl0sImp0aSI6ImE4Mjc1OTMzLWZhNDMtNDZkZi05YjM3LTBhZTBkZjRlN2NmNSIsImNsaWVudF9pZCI6Im15LXRydXN0ZWQtY2xpZW50Iiwic2NvcGUiOlsicmVhZCIsIndyaXRlIiwidHJ1c3QiXX0.QfocleF5KfQJNqvgLc0rOc4thAKZNX-sgYfTLEv2n8c
