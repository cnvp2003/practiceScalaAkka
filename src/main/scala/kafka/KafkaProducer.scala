package kafka

import java.util.concurrent.Future


object KafkaProducer extends App {

  import java.util.Properties

  import org.apache.kafka.clients.producer._

  val  props = new Properties()
  props.put("bootstrap.servers", "localhost:9092")

  props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
  props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")

  val producer = new KafkaProducer[String, String](props)

  val TOPIC="plasma_machine_events_local"

  for(i<- 1 to 2){
    val record = new ProducerRecord(TOPIC, "key", s"hello $i")
    println(s"RECORD ${record}")
    val aa: Future[RecordMetadata] = producer.send(record)
    println(s"offset $aa")
  }

  //val record = new ProducerRecord(TOPIC, "key", "the end "+new java.util.Date)
  //println(s"RECORD =>> ${record}")
  //producer.send(record)

  producer.flush()
  producer.close()
}