# Switchfully, Getting Started With Databases

[![Deploy to Heroku](https://www.herokucdn.com/deploy/button.png)](https://heroku.com/deploy)

## Steps
1. Login into Heroku
1. Login into Github
1. Click the "Deploy to Heroku" button
1. Once the app has been deployed, browse to it (user = student, password = ...)

> This will show the database connection string. With this information you can connect to your database, using pgAdmin
>
> jdbc:postgresql://ec2-46-137-156-205.eu-west-1.compute.amazonaws.com:5432/d4aqq2tklmo9sd?user=wbkkqvzkkvunnp&password=bed80f1bca07264f0c10bc3a5f66347a627e4061dd95e6ecd36ed64baaec456d&sslmode=require
>
> host: ec2-46-137-156-205.eu-west-1.compute.amazonaws.com
>
> port: 5432
>
> maintenance database: d4aqq2tklmo9sd
>
> user: wbkkqvzkkvunnp
>
> password: bed80f1bca07264f0c10bc3a5f66347a627e4061dd95e6ecd36ed64baaec456d
>
> sslmode=require
>
> DB restriction: d4aqq2tklmo9sd
1. To actually create your database browse to https://yourapp.herokuapp.com/database
1. To reset the database, do a DELETE to https://yourapp.herokuapp.com/database

## Manual Deployment to Heroku

```sh
$ heroku create
$ git push heroku master
$ heroku open
```
