package com.subrat.streams_terminal;

import com.subrat.data.Student;
import com.subrat.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsMappingExample {

    public static void main(String[] args) {

        Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet())); // this avoids the additional map intermediate operation.

        System.out.println("namesSet : " + namesSet);

        /*Set<String> namesSet = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toSet());*/
        // Instead of the above we are doing below.

        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList())); // this avoids the additional map intermediate operation.

        System.out.println("namesList : " + namesList);

    }

}