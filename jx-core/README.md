# JxCore

The `jx-core` module is a core utility module that provides essential classes and interfaces for building Java applications. It contains various components that can be used across different projects.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The `jx-core` module is designed to simplify common development tasks and provide reusable components for Java projects. It includes classes and interfaces that can be utilized across various domains and applications.

## Features

The `jx-core` module offers the following key features:

- **CrudController**: An abstract class that provides basic CRUD operations (Create, Read, Update, Delete) for a specific domain. It can be extended to implement domain-specific controllers.
- **AppController**: An interface defining common HTTP endpoint methods for RESTful APIs. It includes methods for handling GET, POST, PUT, and DELETE requests.
- **ResponseEntityResolver**: A utility class for creating different types of `ResponseEntity` objects, such as `noContent()` and `created()`.
- **UriResourceProvider**: A utility class for generating URIs with variable values based on the current request.
- **Identifiable**: An interface representing an identifiable object with a unique identifier. It includes a property to access and manipulate the identifier.
- **TwoWayMapper**: An interface for mapping objects bidirectionally between a source and destination type. It provides methods for converting objects in both directions.
- **OneWayMapper**: An interface for mapping objects from a source type to a destination type. It provides a method for converting objects in one direction.
- **ModelNotFoundException**: A sealed class representing a model not found exception. It can be used to handle scenarios where a requested resource could not be found.
- **CrudDomainService**: An abstract class that provides basic CRUD operations for a specific domain. It can be extended to implement domain-specific services.
- **DomainService**: An interface defining common methods for interacting with a specific domain. It includes methods for saving, updating, retrieving, and deleting entities.
- **DefaultRepository**: An interface extending the Spring Data JPA `JpaRepository`. It provides generic methods for performing database operations on entities.

## Installation

The `jx-core` module can be included in your Java project as a dependency. You can add it to your project's build file using your preferred build tool (e.g., Maven, Gradle) by specifying the appropriate coordinates or repository.

## Usage

To use the `jx-core` module in your Java project, follow these steps:

1. Add the module as a dependency in your project configuration.
2. Import the required classes or interfaces into your code.
3. Utilize the provided classes and interfaces based on your specific requirements.

For detailed usage examples and API documentation, please refer to the documentation or code comments within the `jx-core` module.

