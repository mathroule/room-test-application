# room-test-application

Branch `master` is OK. But branch `room-group-issue` give compilation error:
```
Error:(14, 33) error: There is a problem with the query: [SQLITE_ERROR] SQL error or missing database (near "group": syntax error)
```

It's due to a column named group which is not correctly escaped in nested relation in file `com.test.mathroule.myapplication.database.mapping.User`.
