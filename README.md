# pyramidCheck
This is a REST web service/API which has an endpoint which takes a word as an input and returns true if the word is a pyramid word.

# Web Service Resource Endpoint info
This is a GET resource which takes a variable string value in the path variable. Once you run it, the server will check if the word is a pyramid word and tell you in response if it is a pyramid word or not.

# Setup
This is a gradle project. You can setup this project as a gradle project in your local machine.

# Run the Web Service
You can start the project as a SpringBoot Application. Omce the server will start, it will be running on port 8080. You can use the following URL to test the API resource endpoint: GET "localhost:8080/pyramidCheck/banana"

# Examples
1. Example where a word is a pyramid word: banana
2. Example where a word is not a pyramid: bandana
3. Example which will throw exception: 1234


