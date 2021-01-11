package xiaoduhome.entity.secondary;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @author 苗权威
 * @dateTime 19-8-26 下午2:19
 */
@Getter
@Setter
@Entity
@Table(name = "xiaodu_history_tb")
@EntityListeners(AuditingEntityListener.class)
@DynamicUpdate
public class XiaoDuHistoryTB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "work_name")
    private String workName;

    @Column(name = "channel_id")
    private String channelId;

    @Column(name = "xiaodu_user_id")
    private String xiaoduUserId;

    @Column(name = "jyt_user_id")
    private String jytUserId;

    @CreatedDate
    @Column(name = "create_time", updatable = false, nullable = false)
    private Timestamp createTime;

    @LastModifiedDate
    @Column(name = "update_time")
    private Timestamp updateTime;
}