package com.example.catalog.domain.entty;

import com.example.catalog.domain.entity.CastMember;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CastMemberTests {



    @Test
    public void throwIllegalArgumentExceptionWhenNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new CastMember(null));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenNameIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> new CastMember(""));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenNameIsNullAndTypeIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new CastMember(null, null));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenNameIsBlankAndTypeIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new CastMember("", null));
    }

    @Test
    public void throwIllegalArgumentExceptionWhenIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new CastMember("Cast Member 1", null));
    }
    
    @Test
    public void createCastMemberWithname() {
    	
    	final CastMember entity = new CastMember("Pierre");
    	
    	assertNotNull(entity);
    	assertEquals(entity.getName(), "Pierre");
    	assertTrue(entity.isValidUUID(entity.getId().toString()));
    	assertNull(entity.getType());
    }
    
    
}
