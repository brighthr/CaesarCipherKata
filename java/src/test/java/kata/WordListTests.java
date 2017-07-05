package kata;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import utils.WordList;

import java.util.List;

public class WordListTests {

    @Test
    public void word_list_can_be_loaded() throws Exception {
        List<String> strings = WordList.load();

        Assert.assertThat(strings.size(), CoreMatchers.is(CoreMatchers.equalTo(338882)));
    }
}
