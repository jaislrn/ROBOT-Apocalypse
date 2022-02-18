# ROBOT-Apocalypse


Robots - find out the robots details from below URL
http://localhost:8004
http://localhost:8004/robots
***************************************
Resources - find out the resources details from below URL
http://localhost:8003
http://localhost:8003/resources
***************************************
survivors - find out the one or all survivors details from below URL
get
http://localhost:8002/survivors
http://localhost:8002/survivors/P101
-------------------
add  or register survivors 
http://localhost:8002/survivors

add with Resources
{
        "id": "P101",
        "name": "P1",
        "age": "22",
        "gender": "M",
        "lastLoc": [
            "6001",
            "2001L"
        ],
        "resources": {
            "id": "P101",
            "water": "20L",
            "food": "20Kg",
            "medication": "100",
            "ammunition": "5000"
        }
    }

-----------------------------
update
http://localhost:8002/survivors/P101
    {
        "id": "P101",
        "name": "P1",
        "age": "22",
        "gender": "M",
        "lastLoc": [
            "6001",
            "222001L"
        ]
    },

***************************************************
For infacted survivors 3 votes needed to remove from list
1. if you hit below link 3 times, survivor should removed from surviour list 
         http://localhost:8002/survivors/vote/P101

2. you can verify using below URL
	http://localhost:8002/survivors/P101


