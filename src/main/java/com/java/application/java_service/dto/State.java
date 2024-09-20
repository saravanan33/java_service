package com.java.application.java_service.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class State {

        public int state_id;
        public String name;
        public String state_code;
        public String status;
        public String country_code;
        public String language;

        @Override
        public String toString() {
                return "State{" +
                        "state_id=" + state_id +
                        ", name='" + name + '\'' +
                        ", state_code='" + state_code + '\'' +
                        ", status='" + status + '\'' +
                        ", country_code='" + country_code + '\'' +
                        ", language='" + language + '\'' +
                        '}';
        }
}
