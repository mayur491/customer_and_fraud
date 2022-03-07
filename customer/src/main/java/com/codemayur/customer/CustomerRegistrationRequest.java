package com.codemayur.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
