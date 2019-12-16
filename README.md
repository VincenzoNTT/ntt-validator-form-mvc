# ntt-validator-form-mvc

@Annotation Custom Constraints\Validators.

Il progetto ha come obiettivo quello di generalizzare e\o incapsulare all'interno di unico artifact custom le regole che governano le più comuni operazioni
di verifica dei campi lato client.

## Annotation into Artifact : ntt-validator-form-mvc

@FieldMatch: This is a class-level annotation where we can compare two fields for equality an pass in an optional message to display to the user if the 
constraint validation fails.


@ValidPassword: This annotation check valid password. The annotated element must be true :
 
 * **{@code CharSequence} (least 8 characters)**
 * **{@code CharSequence} (at least one upper-case character)**
 * **{@code CharSequence} (at least one lower-case character)**
 * **{@code CharSequence} (at least one digit character)**
 * **{@code CharSequence} (at least one symbol (special character))**
 * **{@code CharSequence} (no whitespace)**
 
 
@Phone: The annotated element phone number digit.
 

## Startup\Use it:

@FieldMatch.List({
        @FieldMatch(baseField = "password", matchField = "confirmPassword", message = "The password fields must match"),
        @FieldMatch(baseField = "email", matchField = "confirmEmail", message = "The email fields must match")
})
MyClassDto{}

@ValidPassword
*private String password;

@Phone
*private String phone;