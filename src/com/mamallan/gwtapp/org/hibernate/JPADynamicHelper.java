package com.mamallan.gwtapp.org.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;


//EclipseLink imports
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.dynamic.DynamicHelper;
import org.eclipse.persistence.dynamic.DynamicType;
import org.eclipse.persistence.jpa.JpaHelper;
import org.eclipse.persistence.sessions.DatabaseSession;

/**
 *
 * @author dclarke
 * @since EclipseLink 1.2
 */
public class JPADynamicHelper extends DynamicHelper {

    public JPADynamicHelper(EntityManagerFactory emf) {
        super(JpaHelper.getServerSession(emf));
    }

    public JPADynamicHelper(EntityManager em) {
        super((DatabaseSession) JpaHelper.getEntityManager(em).getActiveSession());
//	super(JpaHelper.getEntityManager(em).getServerSession());
    }

    /**
     * Add one or more EntityType instances to a session and optionally generate
     * needed tables with or without FK constraints.
     */
    public void addTypes(boolean createMissingTables, boolean generateFKConstraints, DynamicType... types) {
        super.addTypes(createMissingTables, generateFKConstraints, types);
        for (DynamicType type : types) {
            ClassDescriptor descriptor = type.getDescriptor();
            descriptor.getQueryManager().checkDatabaseForDoesExist();
        }
    }
}