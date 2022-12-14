

/* using */
{
  "rules": {
    "posts": {
      "$uid": {
        ".read": "$uid === auth.uid",
          ".write": "$uid === auth.uid"
      }
    }
  }
}
{
  "rules": {
    ".read": true,
      ".write": true
  }
}
/* --------------------------- */

/* no security
------------------------------ */
{
    "rules": {
        ".read": true,
        ".write": true
    }
}

/* server closed
------------------------------ */
{
    "rules": {
        ".read": false,
        ".write": false
    }
}

/* Only Authenticated Users can read & write the data:
------------------------------ */
{
    "rules": {
        ".read": "auth != null",
        ".write": "auth != null"
    }
}

/* Only user can read & write his own data:
------------------------------ */
{
  "rules": {
    "posts": {
      "$uid": {
        ".read": "$uid === auth.uid",
          ".write": "$uid === auth.uid"
      }
    }
  }
}

/* Only Admins can read & write the data:
------------------------------ */
{
    "rules":{
        "announcements":{
            ".read": true,
            ".write": "root.child('badges/admin/' + auth.uid).exists()"
        }
    }
}

/* Only Particular User can write:
------------------------------ */
{
    "rules":{
        ".read": true,
        ".write": "auth.uid == 'pasteYourUID' "
    }
}

/* Only Users having verified emails can write:
------------------------------ */
{
    "rules":{
        ".read": true,
        ".write": "auth.token.email_verified === true"
    }
}

/*  */




// Validates user is moderator from different database location

{
  "rules": {
    "posts": {
       "$uid": {
         ".write": "root.child('users').child('moderator').val() === true"
       }
     }
   }
}

// Validates string datatype and length range

{
  "rules": {
    "posts": {
       "$uid": {
         ".validate": "newData.isString() 
                       && newData.val().length > 0
                       && newData.val().length <= 140"
       }
     }
   }
}

// Checks presense of child attributes

{
  "rules": {
    "posts": {
       "$uid": {
         ".validate": "newData.hasChildren(['username', 'timestamp'])"
       }
     }
   }
}

// Validates timestamp is not a future value

{
  "rules": {
    "posts": {
       "$uid": {
         "timestamp": { 
           ".validate": "newData.val() <= now" 
         }
       }
     }
   }
}


// Prevents Delete or Update
{
  "rules": {
    "posts": {
       "$uid": {
         ".write": "!data.exists()"
       }
     }
   }
}

// Prevents only Delete
{
  "rules": {
    "posts": {
       "$uid": {
         ".write": "newData.exists()"
       }
     }
   }
}

// Prevents only Update
{
  "rules": {
    "posts": {
       "$uid": {
         ".write": "!data.exists() || !newData.exists()"
       }
     }
   }
}

// Prevents Create and Delete
{
  "rules": {
    "posts": {
       "$uid": {
         ".write": "data.exists() && newData.exists()"
       }
     }
   }
}