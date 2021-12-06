package de.apnmt.common;

import de.apnmt.common.event.ApnmtEvent;
import de.apnmt.common.event.ApnmtEventType;
import de.apnmt.common.event.value.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ApnmtTestUtil {

    private static final LocalDateTime DEFAULT_START_AT = LocalDateTime.of(2021, 12, 24, 0, 0, 11, 0);
    private static final LocalDateTime DEFAULT_END_AT = LocalDateTime.of(2021, 12, 25, 0, 0, 11, 0);

    private static final LocalTime DEFAULT_START_TIME = LocalTime.of(8, 0, 11, 0);
    private static final LocalTime DEFAULT_END_TIME = LocalTime.of(18, 0, 11, 0);


    public static AppointmentEventDTO createAppointmentEventDTO() {
        AppointmentEventDTO appointment = new AppointmentEventDTO();
        appointment.setId(1L);
        appointment.setStartAt(DEFAULT_START_AT);
        appointment.setEndAt(DEFAULT_END_AT);
        appointment.setEmployeeId(2L);
        appointment.setOrganizationId(3L);

        return appointment;
    }

    public static ApnmtEvent<AppointmentEventDTO> createAppointmentEvent(ApnmtEventType type) {
        return new ApnmtEvent<AppointmentEventDTO>().timestamp(LocalDateTime.now()).type(type).value(createAppointmentEventDTO());
    }

    public static ServiceEventDTO createServiceEventDTO() {
        ServiceEventDTO service = new ServiceEventDTO();
        service.setId(1L);
        service.setName("Service");
        service.setDescription("Service Description");
        service.setCost(30.0);
        service.setDuration(30);
        service.setOrganizationId(2L);
        return service;
    }

    public static ApnmtEvent<ServiceEventDTO> createServiceEvent(ApnmtEventType type) {
        return new ApnmtEvent<ServiceEventDTO>().timestamp(LocalDateTime.now()).type(type).value(createServiceEventDTO());
    }

    public static ClosingTimeEventDTO createClosingTimeEventDTO() {
        ClosingTimeEventDTO closingTimeEventDTO = new ClosingTimeEventDTO();
        closingTimeEventDTO.setId(1L);
        closingTimeEventDTO.setStartAt(DEFAULT_START_AT);
        closingTimeEventDTO.setEndAt(DEFAULT_END_AT);
        closingTimeEventDTO.setOrganizationId(2L);
        return closingTimeEventDTO;
    }

    public static ApnmtEvent<ClosingTimeEventDTO> createClosingTimeEvent(ApnmtEventType type) {
        return new ApnmtEvent<ClosingTimeEventDTO>().timestamp(LocalDateTime.now()).type(type).value(createClosingTimeEventDTO());
    }

    public static WorkingHourEventDTO createWorkingHourEventDTO() {
        WorkingHourEventDTO workingHourEventDTO = new WorkingHourEventDTO();
        workingHourEventDTO.setId(1L);
        workingHourEventDTO.setStartAt(DEFAULT_START_AT);
        workingHourEventDTO.setEndAt(DEFAULT_END_AT);
        workingHourEventDTO.setEmployeeId(2L);
        return workingHourEventDTO;
    }

    public static ApnmtEvent<WorkingHourEventDTO> createWorkingHourEvent(ApnmtEventType type) {
        return new ApnmtEvent<WorkingHourEventDTO>().timestamp(LocalDateTime.now()).type(type).value(createWorkingHourEventDTO());
    }

    public static OpeningHourEventDTO createOpeningHourEventDTO() {
        OpeningHourEventDTO openingHourEventDTO = new OpeningHourEventDTO();
        openingHourEventDTO.setId(1L);
        openingHourEventDTO.setStartTime(DEFAULT_START_TIME);
        openingHourEventDTO.setEndTime(DEFAULT_END_TIME);
        openingHourEventDTO.setOrganizationId(2L);
        return openingHourEventDTO;
    }

    public static ApnmtEvent<OpeningHourEventDTO> createOpeningHourEvent(ApnmtEventType type) {
        return new ApnmtEvent<OpeningHourEventDTO>().timestamp(LocalDateTime.now()).type(type).value(createOpeningHourEventDTO());
    }

}
