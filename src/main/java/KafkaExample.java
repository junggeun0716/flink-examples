import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class KafkaExample {

	public static void main(String[] args) throws Exception {
		final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

		env.execute("Kafka Example");
	}
}
