package com.dio.heroesapi.config;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDynamoDBRepositories
public class HeroesTable {
}
