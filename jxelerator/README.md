<a name="readme-top"></a>
<br />
<div align="center">
  <a href="#">
   <!-- Replace this logo for a custom official logo -->
    <img src="./readme-assets/logos/jxelerate.svg" alt="Logo" width="250" height="190">
  </a>

<h1 align = "center">
<b><i>Jxelerator</i></b>
</h1>
</div>

**_Jxelerator_** is a simple internal library designed to provide clear-cut persistence functionality with _HATEOAS_ (
Hypermedia as the Engine of Application State) support up to a basic level of [Richardson Maturity].

It offers a set of components and abstractions that enable the development of RESTful APIs with hypermedia links,
facilitating resource navigation and interaction.

## Table of Contents

- [Introduction](#introduction)
- [Installation](#installation)
- [Documentation](#documentation)
- [Key Components](#Components)
- [Components](#components)
- [LICENSE](#license)

## Introduction

The `jxelerator` module is designed to simplify common development tasks and provide reusable components for Spring Boot
projects.
It includes classes and interfaces that can be utilized across various domains and applications.

## Documentation

**_Jxelerator_** provides comprehensive documentation that details its features, components, and usage. The
documentation is generated using Dokka and [**available via GitHub Pages**](https://jxareas.github.io/jxelerator/).

It serves as a valuable resource for understanding the library's simple capabilities and utilizing its functionalities
effectively.

## Installation

The `jxelerator` module can be included in your Java project as a dependency. You can add it to your project's build
file using your preferred build tool (e.g., Maven, Gradle) by specifying the appropriate coordinates or repository.

## Usage

To use the `jxelerator` module in your Java project, follow these steps:

1. Add the module as a dependency in your project configuration.
2. Import the required classes or interfaces into your code.
3. Utilize the provided classes and interfaces based on your specific requirements.

For detailed usage examples and API documentation, please refer to the documentation or code comments within
the `jxelerator` module.

## Components

_Jxelerator_ provides a set of interfaces, base abstract classes, helpers, extensions and annotations that can be
extended and implemented to build custom functionality. Here's a brief overview of some of their key components:

## Base Abstract Classes

- `HyperController`: An abstract class that serves as a controller for handling hypermedia-based operations.

- `PersistentService`: An abstract class that represents a domain service responsible for managing persistent entities.

- `MirrorMapper.Adapter`: An abstract class that acts as a mapper between source and destination objects and provides a
  basic mapping implementation using a ModelMapper instance.

# Interfaces

- `LinkableController`: An interface that defines a set of methods for a controller that can generate hypermedia links.

- `DomainService`: An interface that defines a set of methods for a domain service responsible for managing entities.

- `MirrorMapper`: An interface that represents a mapper between a source and destination object.

### Annotations

_Jxelerator_ provides several annotations that can be used to configure and enhance your application:

- `@EnableJxelerator`: An annotation that enables the default configuration handling in your application. It should be
  used at the application configuration level (e.g., on your main Spring Boot application class).

- `@EnableNonRestrictiveCorsPolicy`: An annotation that enables a non-restrictive CORS (Cross-Origin Resource Sharing)
  policy for your application. It allows cross-origin requests from any origin, enabling broader access to your API
  endpoints for development purposes.

### Helpers

- `ResponseEntityProvider`: Contains static methods for creating instances of the ResponseEntity class, which represents
  the HTTP response to be sent back to the client.

- `UriResourceProvider`: A namespace over `ServletUriComponentsBuilder` for constructing URIs based on different
  patterns and variable values.

### LICENSE

**_Jxelerator_** is licensed under the [GNU Affero GPL v3.0](https://github.com/jxareas/PolyLab/blob/master/LICENSE).

[Richardson Maturity]: https://martinfowler.com/articles/richardsonMaturityModel.html
