# Read me

The original idea is from  
https://blog.stackademic.com/handling-csrf-issues-with-spring-boot-security-6-0d41142cffb1?source=explore---------16-83--------------------e5af374c_f056_4c41_b43b_39987c5b4072-------15

# CSRF Protection in Spring Security

Spring Security configures a filter called CsrfFilter by default. The filter allows non-modifying requests (GET, HEAD,
TRACE, and OPTIONS) to pass through, but intercepts state-changing requests (PUT, POST, and DELETE) and checks whether
the request has a header named X-CSRF-TOKEN with a CSRF token. If there is no CSRF token, the request is filtered out
with a 403 FORBIDDEN error.

Go to
http://localhost:8080/

Login and then the html page will show CSRF token
