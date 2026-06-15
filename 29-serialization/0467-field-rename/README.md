# 0467 — Field rename

Map a code field name to a different JSON key. This lesson uses Jackson (`com.fasterxml.jackson.core:jackson-databind`) with the `@JsonProperty` annotation to rename the record component `fullName` to the JSON key `full_name`, then serializes it to compact JSON with `ObjectMapper.writeValueAsString`.

## Run

    jbang FieldRename.java
