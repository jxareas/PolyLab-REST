<a name="readme-top"></a>
<br />
<div align="center">
  <a href="#">
   <!-- Replace this logo for a custom official logo -->
    <img src="./readme-assets/logos/jx-core.png" alt="Logo" width="250" height="190">
  </a>

<h1 align = "center">
<b><i>JxCore</i></b>
</h1>
</div>

**JxCore** is an internal library designed to provide persistence functionality with HATEOAS (Hypermedia as the Engine of Application State) support up to a basic level of [Richardson Maturity]. It offers a set of components and abstractions that enable the development of RESTful APIs with hypermedia links, facilitating resource navigation and interaction.

The core concept of JxCore revolves around the separation of concerns, promoting a modular and scalable architecture for building applications.
It provides abstractions for controllers, services, and mappers, allowing developers to focus on business logic while leveraging the power of HATEOAS for enhanced API discoverability and navigation.


## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Documentation](#documentation)
- [Usage](#usage)
- [Components](#components)
- [LICENSE](#license)

## Introduction

The `jx-core` module is designed to simplify common development tasks and provide reusable components for Java projects. It includes classes and interfaces that can be utilized across various domains and applications.

## Documentation
**JxCore** provides comprehensive documentation that details its features, components, and usage. The documentation is generated using Dokka and [available via Github Pages](https://jxareas.github.io/jx-core/).

It serves as a valuable resource for understanding the library's simple capabilities and utilizing its functionalities effectively.


## Installation

The `jx-core` module can be included in your Java project as a dependency. You can add it to your project's build file using your preferred build tool (e.g., Maven, Gradle) by specifying the appropriate coordinates or repository.

## Usage

To use the `jx-core` module in your Java project, follow these steps:

1. Add the module as a dependency in your project configuration.
2. Import the required classes or interfaces into your code.
3. Utilize the provided classes and interfaces based on your specific requirements.

For detailed usage examples and API documentation, please refer to the documentation or code comments within the `jx-core` module.

## Components

## Usage
JxCore provides a set of interfaces, base abstract classes, helpers and annotations that can be extended and implemented to build custom functionality. Here's a brief overview of some key components:

### Base Abstract Classes

- `AppController<DTO, T, ID>`: An abstract class that serves as the base for implementing RESTful controllers with HATEOAS support. It provides methods for retrieving, saving, updating, and deleting entities, all wrapped in appropriate hypermedia links.

- `PersistentService<T, ID>`: An abstract class that provides a default implementation of the `DomainService` interface. It includes methods for retrieving, saving, updating, and deleting entities using a `DefaultRepository`. This class can be extended to create custom service implementations for specific entity types.

### Interfaces
- `HypermediaController<DTO, ID>`: An interface that defines methods for retrieving entities with hypermedia links, retrieving an entity by its ID, saving a new entity, updating an existing entity, and deleting an entity by its ID.

- `TwoWayMapper<DTO, T>`: A mapper interface used for bidirectional mapping between DTOs (Data Transfer Objects) and domain entities. It allows transforming DTOs to entities and vice versa, facilitating data transfer and persistence operations.

- `DomainService<T, ID>`: An interface that defines methods for interacting with the persistence layer. It includes methods for retrieving entities, retrieving identifiers, paging entities, saving entities, updating entities, and deleting entities.

### Annotations

JxCore provides several annotations that can be used to configure and enhance your application:

- `@EnableJxCore`: An annotation that enables the default configuration handling in your application. It should be used at the application configuration level (e.g., on your main Spring Boot application class).

- `@EnableNonRestrictiveCorsPolicy`: An annotation that enables a non-restrictive CORS (Cross-Origin Resource Sharing) policy for your application. It allows cross-origin requests from any origin, enabling broader access to your API endpoints for development purposes.

### Helpers

- `ResponseEntityResolver`: Contains static methods for creating instances of the ResponseEntity class, which represents the HTTP response to be sent back to the client.

- `UriResourceProvider`: A namespace over `ServletUriComponentsBuilder` for constructing URIs based on different patterns and variable values.



### LICENSE

**JxCore** is licensed under the [GNU Affero GPL v3.0](https://github.com/jxareas/PolyLab/blob/master/LICENSE).



[Richardson Maturity]: https://martinfowler.com/articles/richardsonMaturityModel.html
