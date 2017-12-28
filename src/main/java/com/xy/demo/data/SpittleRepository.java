package com.xy.demo.data;

import com.xy.demo.Spittle;
import java.util.List;

public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);
}
