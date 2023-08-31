package com.example.zwagii.Activity;

public class HelperClass {
        String name, email, username, password;
        String imageURLUser;

        public String getImageURLUser() {
            return imageURLUser;
        }

        public void setImageURLUser(String imageURLUser) {
            this.imageURLUser = imageURLUser;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public HelperClass(String name, String email, String username, String password, String imageURLUser) {
            this.name = name;
            this.email = email;
            this.username = username;
            this.password = password;
            this.imageURLUser = imageURLUser;
        }

        public HelperClass() {
        }
    }