# hibernate-refactor
Refactored a `maven` project using `hibernate`

*Used `hibernate` to read data from a csv file, saved the datas into a database, validated each record to avoid duplicate record in database.*


### Dependencie used:
**hibernate-core**

```
<dependency>
  <groupId>org.hibernate</groupId>
  <artifactId>hibernate-core</artifactId>
  <version>5.6.10.Final</version>
</dependency>
```

**mysql-connector**
```
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
   <version>8.0.30</version>
</dependency>
```

**commons-csv**
```
<dependency>
  <groupId>org.apache.commons</groupId>
  <artifactId>commons-csv</artifactId>
  <version>1.9.0</version>
<dependency>
```
Note: All dpendencies can be gotten from [maven repository](https://mvnrepository.com/)


## App.java
![](https://user-images.githubusercontent.com/53521843/197305933-7d0a7e44-3e58-4df0-9425-614023011092.JPG)


## Data-value.java (Java class)
![](https://user-images.githubusercontent.com/53521843/197305936-d6de2ca5-853b-4f48-ba90-1bb5e82eca02.JPG)

## hibernate.cfg.xml (configuration file)
![3](https://user-images.githubusercontent.com/53521843/197305937-919bd829-ee49-48b4-8b0e-7a42d0eebfe5.JPG)

## Validating each record to ensure uniqueness of records 
![5](https://user-images.githubusercontent.com/53521843/197305931-89409f71-48b7-448a-a5c4-2d316e27daef.JPG)

## Mysql database 
![4](https://user-images.githubusercontent.com/53521843/197305926-3e819b91-3ca4-46f4-86e2-02a804aa3563.JPG)

## CSV file
Click [People-datas.csv](https://github.com/clepbo/hibernate-refactor/files/9843141/People-datas.csv) to download file.

![6](https://user-images.githubusercontent.com/53521843/197305932-4283294b-c574-4986-9c88-bc5cf487ea75.JPG)

## For use/contribution

fork `https://github.com/clepbo/hibernate-refactor.git`
```
git clone https://github.com/<username>/hibernate-refactor.git
git remote add upstream https://github.com/<username>/hibernate-refactor.git
git checkout -b <branch name>
```

Pushing contribution
```
git add .
git commit -m "type a message here"
git push --set-upstream origin <branch name>

```
