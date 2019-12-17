package org.launchcode.techjobs_oo;
import java.util.Objects;

    public class JobField {

        public int id;
        public static int nextId = 1;
        public String value;


        public JobField(){
            id = nextId;
            nextId++;
        }

        public JobField(String value) {
            this();
            this.value = value;
        }

        public String toString(){

            return value;
        }


        @Override
        public boolean equals(Object o) {  // Two objects are equal if they have the same id.
            if (this == o) return true;
            if (!(o instanceof Employer)) return false;
            Employer employer = (Employer) o;
            return getId() == employer.getId();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getId());
        }

        public int getId() {
            return id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


