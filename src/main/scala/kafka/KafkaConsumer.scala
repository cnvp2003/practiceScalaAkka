package kafka

import java.util

import org.apache.kafka.clients.consumer.{ConsumerConfig, KafkaConsumer}

import scala.collection.JavaConverters._

object KafkaConsumer extends App {

  import java.util.Properties

  val TOPIC="plasma_machine_events_local"

  val  props = new Properties()
  props.put("bootstrap.servers", "localhost:9092")
  props.setProperty(ConsumerConfig.CLIENT_ID_CONFIG, 1.toString)
  props.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")
  props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
  props.put("group.id", "something")

  val consumer = new KafkaConsumer[String, String](props)

  consumer.subscribe(util.Collections.singleton(TOPIC))
  println(s"TIPOCSSSS ${TOPIC}")

 // while(true){
    val records = consumer.poll(100)
    println(s"SIZE ${records.count()}")
    for (record<-records.asScala){
      println(s"FDDFD ${record.key()} ... ${record.value()}")
    }
  //}
}