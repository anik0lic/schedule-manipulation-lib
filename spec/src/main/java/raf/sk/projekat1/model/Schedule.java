package raf.sk.projekat1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@JsonIgnoreProperties(value = { "info" })
public class Schedule {
    protected LocalDate startDate;
    protected LocalDate endDate;
    protected LocalTime startTime;
    protected LocalTime endTime;
    protected List<LocalDate> nonWorkingDates;
    protected Info info;
    protected List<Appointment> appointments;
    protected List<Places> places;
    
    public Schedule(LocalDate startDate, LocalDate endDate, LocalTime startTime, LocalTime endTime, Info info) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.nonWorkingDates = new ArrayList<>();
        this.appointments = new ArrayList<>();
        this.places = new ArrayList<>();
        this.info = info;
    }

    public Schedule(Info info) {
        this.appointments = new ArrayList<>();
        this.nonWorkingDates = new ArrayList<>();
        this.places = new ArrayList<>();
        this.info = info;
    }

    public Schedule() {
        this.appointments = new ArrayList<>();
        this.nonWorkingDates = new ArrayList<>();
        this.places = new ArrayList<>();
    }

}
