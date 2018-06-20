### Spingboot practice

## Setting default schema

You should have an instance database running
See application.properties and build.graddle files to set database configuration

```
./gradlew -Dflyway.schemas=public flywayClean flywayMigrate
```

## Running the app

```
./gradlew bootRun
```