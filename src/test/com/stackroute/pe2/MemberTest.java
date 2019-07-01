package com.stackroute.pe2;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberTest {
    MemberVariable memberVariable;

    @Before
    public void setup() {
        System.out.println("Before");
        memberVariable = new MemberVariable();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        memberVariable = null;
    }


    @Test
    public void givenAllMenbersShouldReturnMessage() {
        String result =memberVariable.printMemberVariable("rupa",22,25000);
        assertEquals("Members Name: rupa\n" + "Members Age: 22\n" + "Members Salary: 25000.0",result);
    }
    @Test
    public void givenOneMemberShouldReturnMessage() {
        String result =memberVariable.printMemberVariable("Charitha");
        assertEquals("Members Name: Charitha\n" + "Members Age: 0\n" + "Members Salary: 0.0", result);
    }
    @Test
    public void givenTwoMembersShouldReturnMessage() {
        String result =memberVariable.printMemberVariable("Harsha",20);
        assertEquals("Members Name: Harsha\n" + "Members Age: 20\n" + "Members Salary: 0.0", result);
    }
    @Test
    public void givenNameNullMenbersShouldReturnMessage() {
        String result =memberVariable.printMemberVariable(null,22,25000);
        assertEquals("Members Name: null\n" + "Members Age: 22\n" + "Members Salary: 25000.0",result);
    }

}