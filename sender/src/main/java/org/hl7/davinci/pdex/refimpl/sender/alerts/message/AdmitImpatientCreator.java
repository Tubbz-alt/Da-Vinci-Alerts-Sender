package org.hl7.davinci.pdex.refimpl.sender.alerts.message;

import org.hl7.davinci.pdex.refimpl.sender.alerts.AlertType;
import org.hl7.fhir.r4.model.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

@Component(AlertType.ADMIT_INPATIENT)
public class AdmitImpatientCreator extends BaseMessageCreator {

    public Parameters createNotifyOperation(Patient patient) {
        return createDemoNotifyParams(
                patient,
                "IMP", "impatient encounter",
                getTopic(AlertType.ADMIT_INPATIENT, "Alert Admit Inpatient")
        );
    }

    public Bundle createMessageBundle(Patient patient) {
        return createDemoProcessMessage(
                patient,
                "IMP",
                "impatient encounter",
                getTopic(AlertType.ADMIT_INPATIENT, "Alert Admit Inpatient").getCodingFirstRep()
        );
    }
}
