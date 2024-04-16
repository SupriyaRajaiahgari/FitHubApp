Project Name : FitHubApp

Team Name: [Group -03]
Team Members:
Sai kamar Maram(S565093) 
Supriya Panyala Rajaiahgari(S566492) 
Nithish Kumar Madavali(S564535) 
...

Application Information
Description: FitHub is your go-to app for achieving your fitness goals effortlessly. Calculate your BMI, access personalized workout plans, explore a library of exercises,
and track your progress seamlessly.Receive tailored diet plans, log your daily exercises, and connect with a supportive community. With FitHub, fitness success is within reach.


Key Features:

BMI Calculator: Calculate your Body Mass Index (BMI) instantly to assess your current weight status. 
FitHub provides insights into whether you're underweight, normal weight, overweight, or obese, helping you set realistic fitness goals.

Exercise Library: Access a vast library of exercises with detailed instructions and demonstration videos. 
Whether you prefer cardio, strength training, yoga, or HIIT, FitHub has exercises to suit your preferences and fitness level.

Nutrition Plans: Receive personalized diet plans based on your fitness goals, dietary preferences, and nutritional needs. 
FitHub offers balanced meal plans with delicious recipes and nutritional information to fuel your body and support your fitness journey.

Progress Tracking: Monitor your fitness progress with number of hours workout. Visualize changes in your weight,
BMI, body measurements, and workout performance over time to stay motivated and celebrate your achievements.


Database Usage: Instead of relying on local storage options like internal or external storage provided by the Android framework, our application integrates Firebase Database for data management.
Firebase Database is a cloud-hosted NoSQL database that facilitates real-time syncing and offline support for our application's data. Utilizing Firebase SDK, we initialize Firebase Database within our application, 
enabling seamless communication with the cloud-hosted database. By leveraging Firebase's APIs, we directly perform data operations such as reading and writing to Firebase Database, 
ensuring secure management of our application's data in the cloud. This approach simplifies data management tasks and enables features such as real-time synchronization and scalability, 
empowering us to build robust and feature-rich applications without relying on local storage options.


Supported Devices:
Samsung Galaxy A series (e.g., A52, A72)
OnePlus Nord series (e.g., Nord 2)
Google Pixel 4a
Google Pixel 4a 5G
Google Pixel 5
Samsung Galaxy S20 series (e.g., S20, S20+, S20 Ultra)
Samsung Galaxy S21 series (e.g., S21, S21+, S21 Ultra)
Xiaomi Mi 10 series (e.g., Mi 10, Mi 10 Pro)
Motorola Moto G series (e.g., Moto G Power, Moto G Stylus)
Sony Xperia 10 series (e.g., Xperia 10 II)

Operating System: Ensure that your computer is running a supported operating system. Android Studio is compatible with Windows, macOS, and Linux.

Processor: Android Studio runs best on a computer with a multicore processor. A modern Intel or AMD processor with at least two cores is recommended.

Memory (RAM): Android Studio requires a minimum of 8 GB of RAM, although 16 GB or more is recommended for optimal performance, especially when running emulators and performing memory-intensive tasks.

Disk Space: Allocate sufficient disk space for Android Studio and the Android SDK. The installation of Android Studio itself typically requires around 4 GB of disk space, but additional space is needed for downloaded SDK components, emulators, and project files.

Graphics Card: A dedicated graphics card is not required, but having one can improve the performance of the Android Emulator. Ensure that your graphics drivers are up to date for better performance.

Screen Resolution: A monitor with a minimum resolution of 1280 x 800 pixels is recommended to comfortably use Android Studio's interface.

Internet Connection: An internet connection is required to download and install Android Studio, SDK components, and updates. A faster internet connection will result in quicker download speeds.

USB Port: If you plan to test your Android applications on physical devices, ensure that your computer has USB ports for connecting them.


Test Credentials:
Username: fithub@gmail.com
Password: Fithub@03


Sequence Information :    loginpage --> BMI claculator --> weightplans  
                              | -> Create profile               |-> overweight plan  -----|
                              | -> Forgot password                   |-> underweight plan -----|-------> Growth---> Redirect to Bmiclaculator 
                                                                |->  BulidBody plan   -----|









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















