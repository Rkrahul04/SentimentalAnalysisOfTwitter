
package twitter;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import twitter.model.Tweet;   //---------------------------------------

public class TwitterMapper extends Mapper<LongWritable, Text, Text, LongWritable> {

	@Override
	protected void map(LongWritable key, Text value,
			Mapper<LongWritable, Text, Text, LongWritable>.Context context) throws IOException,
			InterruptedException {
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		Tweet tweet = mapper.readValue(value.toString(), Tweet.class);
		
		if(tweet!=null && tweet.getRetweeted_status()!=null && tweet.getRetweeted_status().getUser()!=null)
		{
		String screen_name = tweet.getRetweeted_status().getUser().getScreen_name();
		long retweeted_count = tweet.getRetweeted_status().getRetweet_count();
		
		if(screen_name!=null )
		{
		 context.write(new Text(screen_name), new LongWritable(retweeted_count));
		}
		}
	}
	
}
