Finalized project proposal : FitHubApp


Identify any risky components
Uses an outside API: 

Reliability of the API: Ensure that the API you're integrating is reliable and stable. If the API goes down frequently or experiences downtime, 
it could negatively impact the user experience of your application.

Security of the API: Verify that the API you're using follows security best practices. This includes using HTTPS for communication, 
proper authentication mechanisms (such as API keys or OAuth), and handling sensitive user data (like BMI and body measurements) securely.

Data Privacy: Since your application deals with fitness-related data like BMI and body measurements, it's crucial to ensure 
that the API handles user data responsibly and complies with relevant privacy regulations such as GDPR or HIPAA, depending on your user base and the nature of the data.

API Maintenance and Support: Consider the long-term maintenance and support of the API. APIs can change or be deprecated over time, 
which may require updates to your application. Ensure that there is adequate documentation and support available from the API provider.

Dependency Risks: Relying on an external API means your application's functionality is dependent on the availability and performance of that API.
If the API is discontinued or changes significantly, it could require substantial changes to your application.

Performance Impact: Introducing external API calls can impact the performance of your application, 
especially if the API response times are slow or if there are network issues. Implement proper error handling and caching strategies to mitigate these risks.



Contributors:


Supriya Panyala Rajaiahgari(S566492) :
1.	LoginAcitivity
2.	RegisterActivity
3.	CreateProfileActivity
4.	ForgotPasswordActivity


Sai Kumar Maram (S565093):
1.	BMICalculator
2.	WeightPlans
3.	OverWeight


Nithish Kumar Madavali (S564535):
1.	Underweight
2.	Bodybuild
3.	Growth


