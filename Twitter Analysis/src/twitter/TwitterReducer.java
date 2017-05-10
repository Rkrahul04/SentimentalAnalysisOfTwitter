package twitter;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class TwitterReducer extends Reducer<Text, LongWritable, Text, Text> {


	@Override
	protected void reduce(Text key, Iterable<LongWritable> values,
			Reducer<Text, LongWritable, Text, Text>.Context context)
			throws IOException, InterruptedException {
	
		long retweet_count=0;
		
		for(LongWritable value : values)
		{
			retweet_count+=value.get(); 
		}
		
		context.write(key, new Text(Long.toString(retweet_count)));
	}
	
}
