# _Airlines_
##### This is the midterm project for WAA using JSF and REST service

###### The Urls and Descriptions for all Rest Service are as follows:

1. For Airlines
    1. GET [http://localhost:8080/midTermProject/rs/allAirlines]()
        * List of all airlines in following Format
          ```
          output:
          [
            {
              "id": 10,
              "name": "oneworld"
            },
            {
              "id": 17,
              "name": "North Star"
            }
          ]
            ```
    
    2. POST [http://localhost:8080/midTermProject/rs/airline/create]()
        * Creates new Airline
            ``` 
            eg: POST http://localhost:8080/midTermProject/rs/airline/create
            input: 
            {
            	"name":"Airline"
            }
            output:
           {
             "id": 1452,
             "name": "Airline"
           }
    3. DELETE [http://localhost:8080/midTermProject/rs/airline/delete/{id}]()
        * Deletes the airline that matches the id
            ```
            eg: DELETE http://localhost:8080/midTermProject/rs/airline/delete/1451
            output:
            Gives an Status 200 OK
    4. PUT [http://localhost:8080/midTermProject/rs/airline/update]()
        * Updates airline
            ```
            eg: PUT http://localhost:8080/midTermProject/rs/airline/update
            input:
           {
           	"id":"1452",
               "name":"Yeti Airlines"
             }
            output:
           {
             "id": 1452,
             "name": "Yeti Airlines"
           }
2. For Airplane
    1. GET [http://localhost:8080/midTermProject/rs/airplane/retrieve]()
        * List of all Airplanes in following Format
          ```
          output:
          [
            {
              "capacity": 416,
              "id": 7,
              "model": "747",
              "serialnr": "54321"
            },
            {
              "capacity": 519,
              "id": 11,
              "model": "A380",
              "serialnr": "23451"
            },
            {
              "capacity": 416,
              "id": 15,
              "model": "747",
              "serialnr": "43215"
            }]
            ```
 
    2. POST [http://localhost:8080/midTermProject/rs/airplane/create]()
        * Creates a new Airplane 
            ```
            eg: GET http://localhost:8080/midTermProject/rs/airplane/create
           input:
           {
               "capacity": 416,
               "id": 7,
               "model": "747",
               "serialnr": "54321"
             }
            output: 
            {
                "capacity": 416,
                "id": 7,
                "model": "747",
                "serialnr": "54321"
              }
            ```
    
    3. DELETE [http://localhost:8080/midTermProject/rs/airplane/delete/{id}]()
           * Deletes the airline that matches the id
               
               eg: DELETE http://localhost:8080/midTermProject/rs/airplane/delete/7
               output:
               Returns the Status 200 OK
               
     4.PUT [http://localhost:8080/midTermProject/rs/airplane/update]()
               * Updates airline
                   
                   eg: PUT http://localhost:8080/midTermProject/rs/airplane/update
                   input:
                    {
                       "capacity": 416,
                       "id": 15,
                       "model": "747",
                       "serialnr": "43215"
                     }
                   output:
                    {
                       "capacity": 416,
                       "id": 15,
                       "model": "747",
                       "serialnr": "43215"
     
                    }     
                    
      3.For Airport
      1. GET [http://localhost:8080/midTermProject/rs/airport/retrieve]()
              * List of all Airports in following Format
                
                output:
                [
                  {
                    "airportcode": "AMS",
                    "city": "Amsterdam",
                    "country": "The Netherlands",
                    "id": 4,
                    "name": "Schiphol"
                  },
                  {
                    "airportcode": "DTW",
                    "city": "Detroid",
                    "country": "USA",
                    "id": 5,
                    "name": "Detroid City"
                  },
                  {
                    "airportcode": "NRT",
                    "city": "Tokyo",
                    "country": "Japan",
                    "id": 8,
                    "name": "Narita International Airport"
                  }]
               
         2.POST [http://localhost:8080/midTermProject/rs/airpot/create]()
                *Create a new Airpot everytime
                
                 eg: GET http://localhost:8080/midTermProject/rs/airpot/create
                                  input:
                                {
                                    "airportcode": "AMS",
                                    "city": "Amsterdam",
                                    "country": "The Netherlands",
                                    "id": 4,
                                    "name": "Schiphol"
                                  }
                                   output: 
                                   {
                                       "airportcode": "AMS",
                                       "city": "Amsterdam",
                                       "country": "The Netherlands",
                                       "id": 4,
                                       "name": "Schiphol"
                                     }
                                     
          3.DELETE [http://localhost:8080/midTermProject/rs/airplane/delete/{id}]()
                 * Deletes the airline that matches the id
                                   
                     eg: DELETE http://localhost:8080/midTermProject/rs/airplane/delete/4
                                   output:
                                   Returns the Status 200 OK
                                   
            4.PUT [http://localhost:8080/midTermProject/rs/airplane/update]()
                          * Updates airline
                              
                              eg: PUT http://localhost:8080/midTermProject/rs/airplane/update
                              input:
                               {
                                   "airportcode": "DTW",
                                   "city": "Detroid",
                                   "country": "USA",
                                   "id": 5,
                                   "name": "Detroid City"
                                 }
                              output:
                               {
                                   "airportcode": "DTW",
                                   "city": "Detroid",
                                   "country": "USA",
                                   "id": 5,
                                   "name": "Detroid City"
                                 }   
                                 
      4.For Flights
      
     1. GET [http://localhost:8080/midTermProject/rs/airport/retrieve]()
                       * List of all Airports in following Format               
                      
                        output:
                       [
                         {
                           "airline": {
                             "id": 10,
                             "name": "oneworld"
                           },
                           "airplane": {
                             "capacity": 519,
                             "id": 11,
                             "model": "A380",
                             "serialnr": "23451"
                           },
                           "arrivalDate": "6/25/15",
                           "arrivalTime": "6:15 AM",
                           "departureDate": "8/5/09",
                           "departureTime": "10:30 PM",
                           "destination": {
                             "airportcode": "SYD",
                             "city": "Sydney",
                             "country": "Australia",
                             "id": 12,
                             "name": "Kingsford Smith"
                           },
                           "flightnr": "QF 12",
                           "id": 9,
                           "origin": {
                             "airportcode": "LAX",
                             "city": "Los Angeles",
                             "country": "USA",
                             "id": 13,
                             "name": "Los Angeles International"
                           }
                         },
                         {
                           "airline": {
                             "id": 10,
                             "name": "oneworld"
                           },
                           "airplane": {
                             "capacity": 416,
                             "id": 15,
                             "model": "747",
                             "serialnr": "43215"
                           },
                           "arrivalDate": "6/25/15",
                           "arrivalTime": "6:55 AM",
                           "departureDate": "8/6/09",
                           "departureTime": "9:55 PM",
                           "destination": {
                             "airportcode": "NRT",
                             "city": "Tokyo",
                             "country": "Japan",
                             "id": 8,
                             "name": "Narita International Airport"
                           },
                           "flightnr": "QF 21",
                           "id": 14,
                           "origin": {
                             "airportcode": "SYD",
                             "city": "Sydney",
                             "country": "Australia",
                             "id": 12,
                             "name": "Kingsford Smith"
                           }
                         }]
                         
     2. GET [http://localhost:8080/midTermProject/rs/flight/14]()
                             * Find a single flight by id   
                                         
                          output:
                          {
                                                     "airline": {
                                                       "id": 10,
                                                       "name": "oneworld"
                                                     },
                                                     "airplane": {
                                                       "capacity": 416,
                                                       "id": 15,
                                                       "model": "747",
                                                       "serialnr": "43215"
                                                     },
                                                     "arrivalDate": "6/25/15",
                                                     "arrivalTime": "6:55 AM",
                                                     "departureDate": "8/6/09",
                                                     "departureTime": "9:55 PM",
                                                     "destination": {
                                                       "airportcode": "NRT",
                                                       "city": "Tokyo",
                                                       "country": "Japan",
                                                       "id": 8,
                                                       "name": "Narita International Airport"
                                                     },
                                                     "flightnr": "QF 21",
                                                     "id": 14,
                                                     "origin": {
                                                       "airportcode": "SYD",
                                                       "city": "Sydney",
                                                       "country": "Australia",
                                                       "id": 12,
                                                       "name": "Kingsford Smith"
                                                     }
                                                   }
                                                   
      3. POST [http://localhost:8080/midTermProject/rs/flight/create]()
                                     * Create a new flight
                                       
                         output:
                         {
                         "arrivalDate": "6/25/15",
                          "arrivalTime": "6:55 AM",
                          "departureDate": "8/6/09",
                          "departureTime": "9:55 PM",
                          "flightnr": "QF 21",
                           "id": 27
                           
                           }
       
        4. PUT [http://localhost:8080/midTermProject/rs/flight/27]()
                                  * Update a flight by ID
                                                 
                                   output:
                                   {
                                   "arrivalDate": "6/25/15",
                                    "arrivalTime": "6:55 AM",
                                    "departureDate": "8/6/09",
                                    "departureTime": "10:00 PM",
                                    "flightnr": "QF 22",
                                     "id": 27
                                     }
        DELETE [http://localhost:8080/midTermProject/rs/flight/27]()
                                             * Update a flight by ID
                                                            
                                     output:
                                  Message File successfully deleted with status ok
        
        vi.PUT [http://localhost:8080/midTermProject/rs/flight/27/origin/12]()
                                  *Include an origin details in flight
                                  
                                  output:
                           {
                               "arrivalDate": "6/25/15",
                                "arrivalTime": "6:55 AM",
                                 "departureDate": "8/6/09",
                                 "departureTime": "10:00 PM",
                                   "flightnr": "QF 22",
                                     "id": 27
                                     "origin": {
                                       "airportcode": "SYD",
                                           "city": "Sydney",
                                        "country": "Australia",
                                            "id": 12,
                                         "name": "Kingsford Smith"
       
        vii.PUT [http://localhost:8080/midTermProject/rs/flight/27/destination/8]()
                                              *Include an Destination details in flight
                                              
                                              output:
                                       {
                                           "arrivalDate": "6/25/15",
                                            "arrivalTime": "6:55 AM",
                                             "departureDate": "8/6/09",
                                             "departureTime": "10:00 PM",
                                               "flightnr": "QF 22",
                                                 "id": 27
                                                 "origin": {
                                                   "airportcode": "SYD",
                                                       "city": "Sydney",
                                                    "country": "Australia",
                                                        "id": 12,
                                                     "name": "Kingsford Smith"
                                                            },
                                              "destination": {
                                            "airportcode": "NRT",
                                               "city": "Tokyo",
                                              "country": "Japan",
                                                "id": 8,
                                               "name": "Narita International Airport"
                                                  }
                                               }       
                                             
        viii. GET [http://localhost:8080/midTermProject/rs/flight/27/airline/10]()
                                      * Include an airline detail in a flight  
                                                  
                                   output:
                                   {
                                                              "airline": {
                                                                "id": 10,
                                                                "name": "oneworld"
                                                              },
                                                              "arrivalDate": "6/25/15",
                                                              "arrivalTime": "6:55 AM",
                                                              "departureDate": "8/6/09",
                                                              "departureTime": "10:00 PM",
                                                              "destination": {
                                                                "airportcode": "NRT",
                                                                "city": "Tokyo",
                                                                "country": "Japan",
                                                                "id": 8,
                                                                "name": "Narita International Airport"
                                                              },
                                                              "flightnr": "QF 21",
                                                              "id": 27,
                                                              "origin": {
                                                                "airportcode": "SYD",
                                                                "city": "Sydney",
                                                                "country": "Australia",
                                                                "id": 12,
                                                                "name": "Kingsford Smith"
                                                              }
                                                            }
                               
         ix GET [http://localhost:8080/midTermProject/rs/flight/27/airplane/15]()
                                         * Include an airplane detail in a flight  
                                                     
                                      output:
                                      {
                                                                 "airline": {
                                                                   "id": 10,
                                                                   "name": "oneworld"
                                                                 },
                                                                 "airplane": {
                                                                   "capacity": 416,
                                                                   "id": 15,
                                                                   "model": "747",
                                                                   "serialnr": "43215"
                                                                 },
                                                                 "arrivalDate": "6/25/15",
                                                                 "arrivalTime": "6:55 AM",
                                                                 "departureDate": "8/6/09",
                                                                 "departureTime": "10:00 PM",
                                                                 "destination": {
                                                                   "airportcode": "NRT",
                                                                   "city": "Tokyo",
                                                                   "country": "Japan",
                                                                   "id": 8,
                                                                   "name": "Narita International Airport"
                                                                 },
                                                                 "flightnr": "QF 21",
                                                                 "id": 27,
                                                                 "origin": {
                                                                   "airportcode": "SYD",
                                                                   "city": "Sydney",
                                                                   "country": "Australia",
                                                                   "id": 12,
                                                                   "name": "Kingsford Smith"
                                                                 }
                                                               }
                                   
                           
      
                                                                              
              