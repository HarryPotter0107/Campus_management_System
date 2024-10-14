package com.campus_management.controller;

import com.campus_management.models.*;
import com.campus_management.service.AdminService;
import com.campus_management.service.FacultyService;
import com.campus_management.service.StudentService;
import com.campus_management.service.NoticeService;
import com.campus_management.service.SubjectService;
import com.campus_management.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
public class RouteController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private FacultyService facultyService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private NoticeService noticeService;

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private TimetableService timetableService;

    @RequestMapping("/")
    public ModelAndView landingPage(){
        return new ModelAndView("Landing");
    }

    @RequestMapping("/login")
    public ModelAndView loginPage(){
        return new ModelAndView("Login");
    }

    @PostMapping("/login-user")
    public UserModel loginUser(@ModelAttribute UserModel userData, Model model) {
        try {
            System.out.println(userData.getUsertype());
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/register")
    public ModelAndView registerPage(){
        return new ModelAndView("Register");
    }

    @RequestMapping("/register-user")
    public AdminModel registerUser(@ModelAttribute AdminModel adminData, Model model) {
        try {
            return adminService.registerAdmin(adminData);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/student-home")
    public ModelAndView studenthomePage(){
        return new ModelAndView("student/Student-home");
    }

    @RequestMapping("/student-marks")
    public ModelAndView studentmarksPage(){
        return new ModelAndView("student/Student-marks");
    }

    @RequestMapping("/student-notice")
    public ModelAndView studentnoticePage(){
        return new ModelAndView("student/Student-notice");
    }

    @RequestMapping("/student-timetable")
    public ModelAndView studenttimetablePage(){
        return new ModelAndView("student/Student-timetable");
    }

    @RequestMapping("/faculty-home")
    public ModelAndView facultyhomePage(){
        return new ModelAndView("faculty/Faculty-home");
    }

    @RequestMapping("/faculty-marks")
    public ModelAndView facultymarksPage(){
        return new ModelAndView("faculty/Faculty-marks");
    }

    @RequestMapping("/faculty-notice")
    public ModelAndView facultynoticePage(){
        return new ModelAndView("faculty/Faculty-notice");
    }

    @RequestMapping("/faculty-student")
    public ModelAndView facultystudentPage(){
        return new ModelAndView("faculty/Faculty-StudentInfo");
    }

    @RequestMapping("/faculty-timetable")
    public ModelAndView facultytimetablePage(){
        return new ModelAndView("faculty/Faculty-timetable");
    }

    @RequestMapping("/admin-home")
    public ModelAndView adminhomePage(){
        List<StudentModel> students = studentService.getAllStudents();
        List<FacultyModel> faculty = facultyService.getAllFaculty();
        List<SubjectModel> subjects = subjectService.getAllSubjects();
        List<NoticeModel> notices = noticeService.getAllNotices();

        ModelMap modelmap = new ModelMap();
        modelmap.addAttribute("students", students);
        modelmap.addAttribute("faculty", faculty);
        modelmap.addAttribute("subjects", subjects);
        modelmap.addAttribute("notices", notices);

        return new ModelAndView("admin/Admin-home", modelmap);
    }

    @RequestMapping("/admin-addFaculty")
    public ModelAndView adminAddFacultyPage(){
        return new ModelAndView("admin/Admin-addFaculty");
    }

    @PostMapping("/add-Faculty")
    public FacultyModel adminAddFaculty(@ModelAttribute FacultyModel facultyData, Model mode){
        try {
            return facultyService.addFaculty(facultyData);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/admin-addStudent")
    public ModelAndView adminAddStudentPage(){
        return new ModelAndView("admin/Admin-addStudent");
    }

    @PostMapping("/add-Student")
    public StudentModel adminAddStudent(@ModelAttribute StudentModel studentData, Model mode){
        try {
            return studentService.addStudent(studentData);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/admin-updateStudent")
    public ModelAndView adminUpdateStudentPage(){
        return new ModelAndView("admin/Admin-updateStudent");
    }

    @PostMapping("/update-Student")
    public StudentModel adminUpdateStudent(@ModelAttribute StudentModel studentData, Model mode){
        try {
            return studentService.updateStudent(studentData);
        } catch (Exception e) {
            return null;
        }
    }

    @RequestMapping("/admin-addNotice")
    public ModelAndView adminAddNoticePage(){
        return new ModelAndView("admin/Admin-addNotice");
    }

    @PostMapping("/add-Notice")
    public void adminAddNotice(@ModelAttribute NoticeModel noticeData, Model mode){
        try {
            noticeService.createNotice(noticeData);
        } catch (Exception e) {
            // Handle exception
        }
    }

    @RequestMapping("/admin-addSubject")
    public ModelAndView adminAddSubjectPage(){
        return new ModelAndView("admin/Admin-addSubject");
    }

    @PostMapping("/add-Subject")
    public void adminAddSubject(@ModelAttribute SubjectModel subjectData, Model mode){
        try {
            subjectService.addSubject(subjectData);
        } catch (Exception e) {
            // Handle exception
        }
    }

    @RequestMapping("/admin-timetable")
    public ModelAndView adminTimetablePage(){
        return new ModelAndView("admin/Admin-timetable");
    }

    @PostMapping("/add-Timetable")
    public void adminAddTimetable(@ModelAttribute TimetableModel timetableData, Model mode){
        try {
            timetableService.updateTimetable(timetableData);
        } catch (Exception e) {
            // Handle exception
        }
    }
}
