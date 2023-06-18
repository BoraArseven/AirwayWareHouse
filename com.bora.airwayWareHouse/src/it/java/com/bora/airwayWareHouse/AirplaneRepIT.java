package com.bora.airwayWareHouse;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.internal.bytebuddy.utility.JavaDispatcher.Container;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

import com.bora.airwayWareHouse.repository.HibernateAirplanePersister;

public class AirplaneRepIT {

}
