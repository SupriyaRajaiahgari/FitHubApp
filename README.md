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


we are using  the local storage for this project....
We can use the internal or external storage choices that the Android framework offers to attach local storage to an Android project. While external storage gives access to shared or private storage that is accessible by other programs, internal storage provides a private area for data particular to a single app. Context can be used to write to internal storage.utilize context to read using openFileOutput().openFileInput(). Verify the availability of external storage using Environment.write/read files using FileOutputStream and FileInputStream, respectively, after calling getExternalStorageState(). For reliable file operations, don't forget to specify the proper permissions in the manifest and to gracefully manage exceptions and storage availability.








